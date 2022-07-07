func romanToInt(s string) int {
    var priority = make(map[string]int)
    priority["I"] = 1
    priority["V"] = 5
    priority["X"] = 10
    priority["L"] = 50
    priority["C"] = 100
    priority["D"] = 500
    priority["M"] = 1000
    
    var prevValue = ""
    var sum = 0
    
    for pos,char := range(s) {
        
        if pos == 0 {
            prevValue = string(char)
            sum += priority[string(char)]
            continue
        }
        
        if string(char) == prevValue {
            sum += priority[string(char)]
            continue
        }
        
        if priority[prevValue] < priority[string(char)] {
            sum = sum + priority[string(char)] - (2 * priority[prevValue])
        } else {
            sum += priority[string(char)]
        }
        
        prevValue = string(char)
    }
    
    return sum
}