# Equals - Hashcode
### Equals:
- Kiểm tra xem phần tử đã tồn tại trong tập hợp hay chưa hoặc xóa nó ra khỏi tập hợp.
- Có thể sử dụng **contains** để kiểm tra phần tử có tồn tại hay không
### Hashcode
- Trả về một số duy nhất tương ứng với từng object. Mỗi Object trong java đều có 1 định danh và định dang để phân biệt mỗi object chính là giá trị hashcode.
- Khi ta tạo một đối tượng thì obj đó sẽ được lưu vào bộ nhớ HEAP và nó được lưu tại một địa chỉ trong bộ nhớ. Hashcode được tạo ra cho đối tượng bằng cách kết hợp giữa địa chỉ bộ nhớ cộng thêm các tác nhân khác (nhân 30 rồi cộng thêm 2) sau dó sẽ cho ra một mã hashcode.
- Hashcode không chỉ là địa chỉ vùng nhớ mà còn là một thành phần để tạo ra hashcode.