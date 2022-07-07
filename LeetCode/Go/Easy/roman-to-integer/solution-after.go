func romanToInt(s string) int {
    var priority = make(map[string]int)
    priority["I"] = 1
    priority["V"] = 5
    priority["X"] = 10
    priority["L"] = 50
    priority["C"] = 100
    priority["D"] = 500
    priority["M"] = 1000
    
    var sum = 0
    
    for pos,char := range(s) {
        currentValue := priority[string(char)] // reduce looking index execution time
        
        if pos == len(s) - 1 {
            sum += currentValue
            continue
        }
        
        if currentValue < priority[string(s[pos+1])] {
            sum -= currentValue
        } else {
            sum += currentValue
        }
    }
    
    return sum
}