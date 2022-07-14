func canConstruct(ransomNote string, magazine string) bool {
    
    var ransomNoteMap = make(map[string]int)
    var magazineMap = make(map[string]int)
    
    for _, char := range(ransomNote){
        ransomNoteElement := string(char)
        
        if _, ok := ransomNoteMap[ransomNoteElement]; ok{
            ransomNoteMap[ransomNoteElement]++
        } else {
            ransomNoteMap[ransomNoteElement] = 1
        }
    }
    
    for _, char := range(magazine){
        magazineElement := string(char)
        
        if _, ok := magazineMap[magazineElement]; ok{
            magazineMap[magazineElement]++
        } else {
            magazineMap[magazineElement] = 1
        }
    }
    
    for key, value := range(ransomNoteMap) {
        
        if magazineValue, ok := magazineMap[key]; ok{
            if magazineValue < value {
                return false
            }
        } else {
            return false
        }
    }

    return true
}