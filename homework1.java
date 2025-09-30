package kyb;

class MyArrayList1 {
    int[] MyArray;

    //생성자로 배열을 전달 받음
    MyArrayList1(int[] MyArray) {
        this.MyArray = MyArray;
    }

    //배열에 새로운 값 추가
    public void insert(int insertNum) {
        //배열 크기가 초기에 정해지면 값을 늘릴 수 없음
        //새로운 배열을 생성하고, 값을 복사함
        int[] newArr = new int[MyArray.length + 1];
        for (int i = 0; i < MyArray.length; i++) {
            newArr[i] = MyArray[i];
        }
        newArr[newArr.length - 1] = insertNum;
        System.out.println(newArr[newArr.length-1]);
    }

    //배열에서 deleteNum번째값 삭제
    public void delete(int deleteNum) {
        MyArray[deleteNum] = 0;
        for (int i = deleteNum; i < MyArray.length - 1; i++) {
            MyArray[i] = MyArray[i + 1];
        }
        System.out.println(MyArray[deleteNum]);
    }

    //두 배열을 받아, 더한 후 반환
    public int[] add(int[] a, int[] b) {

        int[] c = new int[MyArray.length];
        for (int i = 0; i < MyArray.length; i++) {
            c[i] = a[i] + b[i];
        }

        return c;
    }
}

public class homework1 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{6, 7, 8, 9, 10};

        MyArrayList1 a = new MyArrayList1(arr1);
        MyArrayList1 b = new MyArrayList1(arr2);

        //add
        System.out.println("두 배열의 합");
        int[] c = a.add(arr1,arr2);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();


        //insert
        System.out.println("배열에 새로운 값 추가(추가된 값 출력)");
        a.insert(2);

        //delete
        System.out.println("배열에 i번째 값 삭제(삭제 후 재된 값 출력)");
        a.delete(2);

    }
}

