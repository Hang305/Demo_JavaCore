# Stack - Heap
### Sự khác nhau giữa Head và Stack
##### Heap
- Java **Heap Memory** là bộ nhớ được sử dụng ở runtime để lưu các Objects. Bất cứ khi nào ở đâu trong chương trình của bạn tạo Object thì nó sẽ được lưu trong Heap (**thực thi toán tử new**)
- Thời gian sống của bộ nhớ Head sống **dài hơn**
- Thời gian sống của ọbject phụ thuộc vào Garbage Collection cuả Java. Garbage Collection sẽ chạy trên bộ nhớ Heap để xóa các Object không được sử dụng nữa, nghĩa là object không được reference trong chương trình.
- Các Objects trong Heap đều được **truy cập** bởi **tất cả các nơi trong ứng dụng, bởi các threads khác nhau**.
- Dung lượng Heap **lớn hơn Stack**
- Cơ chế quản lý của Heap thì phức tạp hơn. Heap được phân làm 2 loại Young-Generation, Old=Generation.
- Sử dụng -Xms và -Xmx để định nghĩa dung lượng bắt đầu và dung lượng tối đa của bộ nhớ heap
- Khi heap bị đầy chương trình hiện lỗi java.lang.OutOfMemoryError: Java Heap Space
- Dung lượng sử dụng của Heap sẽ tăng giảm phụ thuộc vào Objects sử dụng.
#### Stack
- Stack Memory là bộ nhớ để lưu các biến local trong hàm và lời gọi hàm ở runtime trong một Thread java. Các biến local bao gồm: loại nguyên thủy (primitive), loai tham chiếu tới đối tượng trong heap (reference), khai báo trong hàm, hoặc đối số được truyền vào hàm.
- Thời gian sống của bộ nhớ Stack sống **ngắn hơn**
- Stack chỉ được sử dụng cho **một Thread duy nhất**. Thread ngoài không thể truy cập vào được.
- Bộ nhớ stack thường nhỏ
- Cơ chế hoạt động là LIFO (Last In First Out) chạy sau chết trước.
- Dùng -Xss để định nghĩa dung lượng bộ nhớ stack
- Khi stack bị đầy bộ nhớ, chương trình phát sinh lỗi: java.lang.StackOverFlowError
- Bất cứ khi nào gọi 1 hàm, một khối bộ nhớ mới sẽ được tạo trong Stack cho hàm đó để lưu các biến local. Khi hàm thực hiện xong, khối bộ nhớ cho hàm sẽ bị xóa, và giải phóng bộ nhớ trong Stack
