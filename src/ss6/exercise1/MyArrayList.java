package ss6.exercise1;

public class MyArrayList {
    private int capacity;
    private int[] arr;
    private int size;
    private int[] emtyArray = {};

    public int size() {
        return size;
    }

    public MyArrayList() {
        arr = emtyArray;
    }

    public MyArrayList(int capacity, int[] arr) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    public void add(int element) {
        if (arr == emtyArray) {
            this.capacity = 10;
            this.arr = new int[this.capacity];
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) { // Tránh trường hợp bằng 0 hoặc 1
                capacity++;
            }

            // Tạo một mảng mới có kích thước là capacity
            int[] brr = new int[this.capacity];

            // copy phan tu
            for (int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }

            arr = brr;
        }
        // cho a tham chiếu đến vùng nhớ mới
        arr[size] = element;
        size++;
    }

    // c. Thêm phan tử vào vị trí index
    public void add1(int index, int element) {
        //Kiểm tra có hợp lệ
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi");
            return;
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) { // Tránh trường hợp bằng 0 hoặc 1
                capacity++;
            }

            int[] brr = new int[this.capacity];

            // sao chép phần tử arr sang brr cho đến index
            for (int i = 0; i < index; i++) {
                brr[i] = arr[i];
            }

            brr[index] = element;

            // sao chép phần tử từ arr sau index sang brr
            for (int i = index; i < size; i++) {
                brr[i + 1] = arr[i];
            }

            arr = brr;
        } else {
            // dịch chuyển phần tử từ index trở về sau sang phải dể tạo chỗ cho element
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
        }
        size++;
    }

    // d. set(int index, int element): Thay thế phần tử tại vị trí index
    public void set(int index, int element) {
        // ktra index có hợp lệ
        if (index < 0 || index >= size) {
            System.out.println("Index ngoài phạm vi");
            return;
        }

        // gán gúa trị mới vào index cụ thể
        arr[index] = element;
    }

    // e. get(int index): Trả về phần tử tại index
    public Integer get(int index) {
        // ktra index có hợp lệ
        if (index < 0 || index >= size) {
            System.out.println("Index ngoài phạm vi");
            return null;
        }

        // gán gúa trị mới vào index cụ thể
        return arr[index];
    }

    // f. indexOf(int element): Lấy vị trí index phần tử đầu tiên tìm thấy
    public int indexOf(int element) {
        // Tìm vị trí index tại phần tử đầu tiên tìm thấy
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }

        // Nếu không tìm thấy trả về -1
        return -1;
    }

    // g. indexOf(int element): Lấy vị trí index phần tử đầu tiên tìm thấy
    public int lastindexOf(int element) {
        // Tìm vị trí index tại phần tử đầu tiên tìm thấy
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }

        // Nếu không tìm thấy trả về -1
        return -1;
    }

    // h. indexOf(int element): Lấy vị trí index phần tử đầu tiên tìm thấy
    public void remove(int index) {
        // ktra index có hợp lệ
        if (index < 0 || index >= size) {
            System.out.println("Index ngoài phạm vi");
            return;
        }

        // Dịch chuyển phần tử từ index trở về sau sang trái dể xóa phần tử tại index
        for (int i = index; i < size - 1; i++) {
            if (arr[i] == index) {
                arr[i] = arr[i + 1];
            }
        }
        size--;
    }

    // i. indexOf(int element): Xóa tất cả phần tử element
    public void removeElement(int element) {
        int newIndex = 0;

        // sao chép các phần tử khác với element vào mảng mới
        for (int i = 0; i < size; i++) {
            if (arr[i] != element) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        size = newIndex;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(arr[i]).append("\t");
        }
        return stringBuilder.toString();
    }
}
