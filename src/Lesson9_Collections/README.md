# Sự khác nhau trong Collection

### Set: 
Là Tập hợp với mỗi dữ liệu bên trong chỉ xuất hiện duy nhất một lần, không trùng nhau, tập hợp chưa được sắp xếp
#### TreeSet:
Sử dụng một tree cho lưu giữ. Các đối tượng được lưu trữ được xếp thứ tự tăng dần.
#### HashSet:
Là một class implement Set Interface, mà các phần tử được lưu trữ dưới dạng BẢNG BĂM (Các mã số duy nhât - KHÔNG TRÙNG LẶP)
#### EnumSet
Là một class như 2 class trên, tuy nhiên khác 2 class trên là các phần tử trong set là các ENUM chứ không phải object

### List (danh sách): 
Là cấu trúc dữ liệu tuyến tính trong đó các phần tử được sắp xếp theo một thứ tự xác định. Cho phép các phần tử được TRÙNG LẶP NHAU
#### ArrayList: 
Là 1 class dạng list được implement dựa trên MẢNG - Array có kích thước thay đổi được
#### LinkedList:
Là một class dạng list hoạt động trên cơ sở của cấu trúc dữ liệu danh sách liên kết đôi (double-linked list)
#### Vector:
Giống ArrayList nhưng Vector là sysnchronized - đồng bộ, có thể hoạt động đa luồng mà không cần gọi synchronize một cách tường minh.
#### Stack: 
Hoạt động dựa trên cơ sở của cấu trúc dữ liệu ngăn xếp (Stack) với kiểu LIFO

### Map (Đồ thị/ánh xạ)
Là kiểu dữ liệu cho phép ta quản lý dữ liệu theo cặp KEY-VALUE, trong đó KEY LÀ DUY NHẤT và tương ứng với 1 key là một giá trị value.
Map Interface không kế thừa từ Collection Interface mà đây là một interface độc lập với các phương thức của riêng mình.
#### TreeMap:
Là class thực thi giao diện Map Interface với dạng cây đỏ đen (Red-Black tree) trong đó các key đã được sắp xếp. Class này cho phép thời gian thêm, sửa, xóa và tìm kiếm 1 phần tử trong Map là tương đương nhau và đều là O(log(n))
#### HashMap
Là class thực thi giao diện Map Interface với các key được lưu trữ dưới dạng bảng băm, cho phép tìm kiếm nhanh O(1)
#### EnumMap:
Các key trong Map lại là các enum chứ không phải object như các dạng Map class trên
#### WeakHashMap: 
Tương tự hashMap, khác là các key trong Map chri là Weak reference (hay Weak key) có nghĩa là khi phần tử sẽ bị xóa khi key được giải phóng hay không còn một biến nào tham chiếu đến key nữa.
### Queue Interface - Queue (hàng đợi) - FIFO
Là kiểu dữ liệu nổi tiếng với kiểu vào ra FIFO (first in first out - vào trước ra trước)
#### LinkedList
Là một class dạng list hoạt động trên cơ sở của cấu trúc dữ liệu danh sách liên kết đôi (double-linked list)
#### PriorityQueue (Queue có ưu tiên): 
Là một dạng queue mà trong đó các phần tử trong queue sẽ được sắp xếp
#### ArrayDeque (Deque: queue 2 chiều):
Là một dạng deque (queue 2 chiều) được implement dựa trên mảng

### Stack (Ngăn xếp) - LILO
Là kiểu dữ liệu nổi tiếng với kiểu vào ra LILO (Last in last out - vào sau ra trước)

## Performance Big O - "Độ phức tạp của thuật toán"
Dùng để chỉ khoảng thời gian tiêu hao để chạy một thuật toán. Sử dụng Big O như một phương tiện để so sánh mức độ hiệu quả của nhiều cách xử lý khác nhau cho cùng một vấn đề.
Thời gian chạy nhanh như thế nào, còn tùy thuộc vào giá trị vào (input) vì giá trị input lớn dần lên khi chương trình chạy

## Phân biệt Collection với Collections
### Collections trong Java
Là kiến trúc để lưu trữ và thao tác với nhóm các đối tượng. Tất cả các hoạt động mà mình thực hiện trên một dữ liệu như tìm kiếm, phân loại, chèn, xóa,... có thể được thực hiện bởi Java Collections
### Java Collection: 
Cung cấp nhiều interface (Set, List, Queue, Deque...) và các lớp(ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet...)
## Sự khác nhau Array và ArrayList
### Array
- Là fix size, cố định số lượng phần tử trong mảng
- Có thể lưu trữ dữ liẹu nguyên thủy và đối tượng
- Tốc độ lưu trữ và thao tác nhanh hơn
- Chỉ có thuộc tính length

### ArrayList
- Số lượng phần tử co giãn được
- Chỉ có thể lưu trữ dữ liệu kiểu đối tượng (Kể từ Java 5, kiểu nguyên thủy được tự động chuyển đổi trong các đối tượng được gọi là auto-boxing)
- Tốc độ lưu trữ vào thao tác chậm hơn
- Có nhiều phương pháp để thao tác với dữ liệu
## Sự khác nhau giữa Set và List
- Set: các phần tử KHÔNG TRÙNG LẶP
- List: các phần tử CÓ THỂ TRÙNG LẶP
## Sự khác nhau giữa ArrayList và Vector
### ArrayList:
- KHÔNG synchronized
- Tăng kích thược của nó bằng 50% kích thước mảng.
### Vector:
- Synchronized
- Vector tăng kích thước của nó bằng cách nhân đôi kích thước mảng
## Sự khác nhau ArrayList và LinkedList
### ArrayList:
- Sử dụng một mảng động
- ArrayList nhanh hơn trong việc trữ và lấy dữ liệu
### LinkedList:
- LinkedList sử dụng danh sách liên kết doubly
- LinkedList nhanh hơn trong việc thao tác dữ liệu 
## Sự khác nhau giữa HashSet/HashMap và TreeSet/TreeMap
- HashSet/HashMap KHÔNG duy trì THỨ TỰ NÀO
- TreeSet/TreeMap duy trì thứ tự TĂNG DẦN
## Sự khác nhau giữa HashSet và HashMap
- HashSet cấu trúc chứa đựng là CÁC GIÁ TRỊ
- HashMap câú trúc chứa đựng là key và value
## Sự khác nhau giữa HashMap và Hashtable
### HashMap
- KHÔNG synchronized
- HashMap cấu trúc chỉ chứa một key null và nhiều giá trị null
### Hashtable 
- Hashtable là synchronized
- Hashtable cấu trúc không chứa bất kỳ key null hoặc giá trị null
## Sự khác nhau Set và Map
- Set chỉ chứa GIÁ TRỊ
- Map chứa cặp KEY-VALUE
