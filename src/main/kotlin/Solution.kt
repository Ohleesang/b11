class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        var array = Array<IntArray>(board.size, { IntArray(board.size, { 0 }) })
        var x = 0 // x = i-1 i i+1
        var y = 0 // y = j-1 j j+1
        var idxArray = (0..board.size - 1)
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == 1) {

                    for (x in i - 1..i + 1) {
                        for (y in j - 1..j + 1) {
                            if (idxArray.contains(x) && idxArray.contains(y)) array[x][y] = 1
                        }
                    }


                }
            }
        }
        var count = 0
        array.forEach {
            it.forEach {
                if (it == 0) count++
            }
        }
        answer = count
        return answer
    }
}

fun main() {
    var a = Solution()
    a.solution(
        arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
        )
    )
    a.solution(
        arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 1, 0),
            intArrayOf(0, 0, 0, 0, 0),
        )
    )
    a.solution(
        arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 1, 1, 1),
        )
    )
}