from sys import stdin, stdout, setrecursionlimit

setrecursionlimit(10 ** 7)

def findFirstLastPosition(arr, n, x):
    # Write your code here.
    fi = first(arr, 0 , n-1 , x , n)
    li = last(arr , 0 , n-1 , x , n)
    
    ans = [fi , li]
    return ans
    # Return a tuple containing two integers denoting the first and last occurrence of X.
    pass

def first(arr, low, high, x, n) :
    if(high >= low) :
        mid = low + (high - low) // 2
        if( ( mid == 0 or x > arr[mid - 1]) and arr[mid] == x) :
            return mid
        elif(x > arr[mid]) :
            return first(arr, (mid + 1), high, x, n)
        else :
            return first(arr, low, (mid - 1), x, n)
     
    return -1

def last(arr, low, high, x, n) :
    if (high >= low) :
        mid = low + (high - low) // 2
        if (( mid == n - 1 or x < arr[mid + 1]) and arr[mid] == x) :
            return mid
        elif (x < arr[mid]) :
            return last(arr, low, (mid - 1), x, n)
        else :
            return last(arr, (mid + 1), high, x, n)
             
    return -1
