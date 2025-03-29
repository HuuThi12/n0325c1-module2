package ss6.exercise1;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(40);
        myArrayList.add(40);

        // b. trả về thông tin đối tượng
        System.out.println("Danh sách ban đầu: " + myArrayList.toString());

        // c. Thêm phần tử tại vị trí index
        myArrayList.add1(2, 25);
        System.out.println("Danh sách sau khi thêm 25 vào vị trí 2: " + myArrayList.toString());

        // d. Thay thế phần tử tại vị trí index
        myArrayList.set(3, 35);
        System.out.println("Danh sách sau khi thay thế 35 vào vị trí thứ 3: " + myArrayList.toString());

        // e. Trả về phần tử tại index
        int elementAtIndex = myArrayList.get(4);
        System.out.println("Phần tử tại vị trí thứ 4: " + elementAtIndex);


        // f. Lấy vị trí index phần tử đầu tiên tìm thấy
        int elementoFind = 20;
        int indexOfElement = myArrayList.indexOf(elementoFind);
        if (indexOfElement != -1) {
            System.out.println("Vị trí index của phần tử: " + elementoFind + " là " + indexOfElement);
        } else {
            System.out.println("Không tìm thấy phần tử: " + elementoFind + " trong danh sách ");
        }

        // g. Lấy vị trí index cuối cùng tìm thấy
        int lastIndexOfElement = myArrayList.lastindexOf(elementoFind);
        if (lastIndexOfElement != -1) {
            System.out.println("Vị trí index của phần tử: " + elementoFind + " là " + lastIndexOfElement);
        } else {
            System.out.println("Không tìm thấy phần tử: " + elementoFind + " trong danh sách ");
        }

        // h. xóa phần tử tại index
        myArrayList.remove(1);
        System.out.println("Danh sách sau khi xóa phần tử tị vị trí 1: " + myArrayList.toString());

        // h. xóa tất cả phần tử element
        myArrayList.removeElement(40);
        System.out.println("Danh sách sau khi xóa phần tử có giá trị 40: " + myArrayList.toString());

    }
}
