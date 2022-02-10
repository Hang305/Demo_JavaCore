# String - String Buffer - String Builder
## String
### Khởi tạo String
`
    String str = "ABC";
    // or
    String str = new String("ABC");`
- Các giá trị trong String là **immutable** (Bất biến - không thay đổi)
- Khi khởi tạo một giá trị String, JVM tìm kiếm giá trị trên **Spring Pool**, nếu tồn tại **trả về một tham chiếu** của đối tượng đã có trên spring pool. Nêú không có thì Spring Pool sẽ tạo mới một đối tượng String và trả tham chiếu của đối tượng đó.
- Nếu dùng toán tử **new**, thì nó sẽ **lấy ra từ bộ nhớ Heap**
- Sử dụng toán tử `+` để nối 2 chuỗi lại với nhau
## Phân biệt String và StringBuffer
- Để thay đổi String (nối chuỗi, cắt) -> tạo một String mới, và không sử dụng lại được giá trị String cũ. Giá trị String cũ sẽ bị bộ dọn rác garbage collection của java xóa đi khỏi bộ nhớ.
- Dẫn tới giá trị cũ tồn tại nhiều trong bộ nhớ, khiến bộ nhớ đầy -> Java cung cấp 3 lớp StringBuffer và StringBulder phục vụ thao tác với String.
- StringBuffer và StringBuilder là **mutable** (có thể thay đổi giá trị), 2 lớp này cung cấp cho chúng ta các method để **thêm, sửa, xóa để thao tác với String**
## Phân biệt StringBuffer với StringBuilder
### StringBuffer
- Khi sử dụng StringBuffer thì xử lý rất chậm (performance)
- Nguyên nhân: Tất cả các method trong StringBuffer là bất đồng bộ và sử dụng cơ chế thread safe (luồng an toàn) -> Khiến quá trình phải chờ đợi lẫn nhau.
### StringBuilder
- Lược bỏ những nhược điểm của StringBuffer như đồng bộ và luồng an toàn.
- Sử dụng StringBuilder sẽ nhanh hơn.
## Kết luận
- Chương trình có nhiều thread (tiến trình) cùng thao tác với String thì sử dụng StringBuffer vì nó hỗ trợ cơ chế thread safe còn nếu không cần thread safe thì chọn StringBuilder.


