class Solution {
    public int countStudents(int[] A, int[] B) {
        int count[] = {0, 0}, len = A.length, p;
        for (int num: A)
            count[num]++;
        for (p = 0; p < len && count[B[p]] > 0; ++p)
            count[B[p]]--;
        return len - p;
    }
}
