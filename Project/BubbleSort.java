public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        
        // วนลูปผ่านสมาชิกใน array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // ถ้าตัวปัจจุบันมากกว่าตัวถัดไป ให้สลับที่
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}