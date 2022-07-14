func canConstruct(ransomNote string, magazine string) bool {
    
    var magazineMap = make(map[string]int)
    
    for _, char := range(magazine){
            magazineMap[string(char)]++
    }
    
    for _, ransomChar := range(ransomNote) {
        
        magazineMap[string(ransomChar)]--
        
        if (magazineMap[string(ransomChar)] < 0){
            return false
        }
    }

    return true
}