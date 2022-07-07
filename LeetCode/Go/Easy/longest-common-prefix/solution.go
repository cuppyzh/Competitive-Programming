func longestCommonPrefix(strs []string) string {
    
    var result = ""
    var index = 0
    
    for true {
        
        if (index >= len(strs[0])){
            return result
        }
        
        var charStr = string(strs[0][index])
        var flag = true
        
        for _, str := range(strs) {
            if index >= len(str) {
                return result
            }
            
            if (charStr != string(str[index])){
                flag = false
            }
        }
        
        if !flag {
            return result
        } else {
            result += string(charStr)
        }
        
        index++
    }
    
    return result
}