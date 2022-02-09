# Generic
#### Generic là viết các phương thức và lớp để tái sử dụng cho các đối tượng thuộc các kiểu dữ liệu khác nhau (Kiểu dữ liệu như Person, Car, Student, Hotel...)
Generics là cơ chế cho phép sử dụng KIỂU DỮ LIỆU NHƯ LÀ THAM SỐ (Tham số hóa kiểu dữ liệu)
- Co phép chúng ta tạo ra các Class, method, interface hoạt động với nhiều kiểu dữ liệu khác nhau
#### Non - Generics
 Sử dụng ArrayList với nhiều kiểu dữ liệu khác nhau 
### Ưu điểm của Generics
- Phát hiện lỗi ngay tại thời điểm biên dịch.
- Không cần phải ép kiểu dữ liệu (Sử dung Generics trong ngoặc nhọn <>).
- Xây dựng các thuật toán tổng quát, tái sử dụng mã nguồn.
#### Quy ước đặt tên tham số cho Generics
- E: Element phần tử
- T: Type - kiểu dữ liệu 
- K: Key - khóa
- V: Value - giá trị 
- N: Number - (kiểu số: Integer, Double, Float)
- S,U,V...: Được sử dụng để đại diện cho các kiểu dữ liệu (Type) thứ 2, 3, 4
### Các kí tự đại diện cho Generics - Wildcard
- `<?>`: chấp nhận tất cả các loại đối số (chứa mọi kiểu đối tượng)
- `<? extends type>`: chấp nhận bất kỳ đối tượng nào miễn là đối tượng này <b>KẾ THỪA TỪ TYPE</b> hoặc là đối tượng của <b>type</b>
- `<? super type>`: chấp nhận bất kỳ đối tượng bào miễn là đối tượng này là <b>CHA CỦA TYPE</b> hoặc đối tượng của <b>type</b>
### Hạn chế của Generics
- Không thể gọi generic với kiểu dữ liệu nguyên thủy
`ArrayList <int> myArr = new ArrayList();`
- Không thể tạo instance cho kiểu dữ liệu generics
  `

        public Generics() {
            object_t = new T();//complie error
            obj = new Object();
        }`
- Không sử dụng static cho Generics
`

        private static T object; //complie error
        public static T get Object(){//complie error
            return object;
        }`
- Không thể tạo mảng Generics
  `

        T[] array; //OK
        T[] array1 = new T[10]//complie error
- Không thể tạo class ngoại lệ là Generics
  `

        class GenericsException<T> extends Exception {}; //compile error
        class GenericsException2<T> extends Throwable {}; //compile error
