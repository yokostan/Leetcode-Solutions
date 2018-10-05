def firstNonRepeating(string): 
    count = getCharCountArray(string) 
    index = -1
    k = 0
  
    for i in string: 
        if count[ord(i)] == 1: 
            index = k 
            break
        k += 1
  
    return index
