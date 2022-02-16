# OOP
## Kế thừa (Inheritance)
- Khi một đối tượng được truyền lại tất cả các thuộc tính và phương thức của đối tượng cha.
- Kế thừa giúp tái sử dụng lại mã nguồn. Nó được sử dụng cho đa hình lúc runtime
- Lớp con **kế thừa tất cả thành phần của lớp cha**, có thể chia sẻ hay mở rộng các đặc tính sẵn có mà không phải tiến hành định nghĩa lại.
## Đa hình (Polymorphism)
- Khi **một nhiệm vụ được thực hiện bởi nhiều cách khác nhau**, tính chất này được gọi là đa hình.
- Thể hiện rõ nhất thông qua việc gọi phương thức xử lý luồng có thể khác nhau.
- Cung cấp khả năng cho phép người lập trình gọi trước một phương thức của dối tượng, tuy chưa xác định đối tượng có phương thức muốn gọi hay không. Thực hiện (run-time), chương trình mới xác định được đối tượng và gọi phương thức tương ứng của đối tượng đó. 
- Áp dụng tính đa hình, sử dụng **phương thức overloading (nạp chồng) hoặc overriding (ghi đè)**
#### Nạp chồng (Overloading):
- Cho phép một lớp có nhiều thuộc tính, phương thức cùng tên những với các tham số khác nhau về kiểu cũng như tham số truyền vào
#### Ghi đè (Overriding)
- Hai phương thức cùng tên, cùng tham số,, cùng kiểu trả về nhưng thằng con viết lại, dùng theo cách của nó và xuất hiện ở lớp cha, lớp con
- Dùng Override, lúc thực thi, nếu lớp Con không có phương thức riêng, phương thức của lớp cha sẽ được gọi, ngược lại nếu có, phương thức của lớp Con được gọi.
## Trừu tượng (Abstraction)
- Trừu tượng là sự ẩn đi những chi tiết bên trong và hiển thị ra các chức năng, tính chất tới người dùng.
- Tính trừu tượng cho phép loại bỏ tính chất phức tạp của đối tượng bằng cách chỉ đưa ra các thuộc tính và phương thức cần thiết của đối tượng trong lập trình
- Tập trung vào cốt lõi thay vì quan tâm đến cách nó thực hiện
- Áp dụng trừu tượng bằng cách **sử dụng abstract class và interface**
### Abstracted class
- Một abstract class phải chứa ít nhất một hay nhiều method trừu tượng
- Một method trừu tượng là một method không có triển khai (Không có dấu ngoặc nhọn và kết thức là một dấu chấm phẩy)
- Một abstract class không thể tạo đối tượng nhưng có thể bao gồm lớp con.
- 
## Đóng gói (Encapsulation)
- Tính chất đảm bảo sự toàn vẹn, bảo mật của đối tượng
- Việc ràng buộc giữa code và data với nhau tạo thành một khổi duy nhất.
- Thể hiện thông qua phạm vi truy cập (access modifier)