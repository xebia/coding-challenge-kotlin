class PascalsTriangle {

    fun triangleRow(n: Int): List<Int> {
        if (n == 0) {
            return listOf(1)
        }

        val previousRow = triangleRow(n - 1)

        val row = mutableListOf(1)
        for (col in 1 until n) {
            row.add(previousRow[col - 1] + previousRow[col] + 1)
        }
        row.add(1)

        return row
    }
}
