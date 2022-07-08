/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
 func isPalindrome(head *ListNode) bool {
    
    list := []int { }
    node := head
    
    for {
        list = append(list, node.Val)
        
        if (node.Next == nil){
            break;
        }
        
        node = node.Next
    }
    
    headItterator := 0
    tailItterator := len(list) - 1
    
    for {
        fmt.Println(headItterator,tailItterator)
        if (list[headItterator] != list[tailItterator]){
            return false;
        }
        
        if (headItterator == tailItterator || headItterator == len(list)/2){
            break;
        }
        
        headItterator++
        tailItterator--
    }
    
    return true;
}