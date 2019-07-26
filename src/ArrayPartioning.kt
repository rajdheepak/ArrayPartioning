

fun main(args: Array<String>) {
    print('\n')
    print(isDistinctSubArrayPossible(arrayOf(1,2,3,4,5),2))
    print('\n')
    print(isDistinctSubArrayPossible(arrayOf(1,1,2,2,3),3))
    print('\n')
    print(isDistinctSubArrayPossible(arrayOf(2,2,4,3,1),4))
    print('\n')
    print(isDistinctSubArrayPossible(arrayOf(),2))
    print('\n')
    print(isDistinctSubArrayPossible(null, 2))
}

private fun isDistinctSubArrayPossible(array: Array<Int>?, subArraySize: Int): String {
    var isPossible = "No"
    if(array == null || array.size < subArraySize) {
        return isPossible
    }

    loop@ for (i in 0..array.size - subArraySize) {
        val subArray = array.copyOfRange(i, i+subArraySize)
        val distinctSubArray = subArray.distinct()
        isPossible = if(subArray.size == distinctSubArray.size) "Yes" else "No"
        if(isPossible == "Yes") {
            break@loop
        }
    }
    return isPossible
}