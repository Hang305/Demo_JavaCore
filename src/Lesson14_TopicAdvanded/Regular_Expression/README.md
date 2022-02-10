# Regular Expression
### Sử dụng:
- Validate dữ liệu khi người dùng nhập vào
- Tìm kiếm một chuỗi con trong một chuỗi cho trước
### Quy tắc viết Regular Expression trong Java
- `.` : So khớp với bất kỳ ký tự đơn nào
- `^` : So khớp phần đầu của chuỗi hay dòng
- `$` : So khớp phần cuối của chuỗi hay dòng
- `(...)` : So khớp với các "nhóm" ký tự bên trong
- `[...]` : So khớp với bất kỳ ký tự đơn nào trong dấu ngoặc vuông
- `[^...]` : So khớp với bất kỳ ký tự đơn nào ngoại trừ các ký tự trong dấu ngoặc vuông
- `[m-n]` : So khớp từ ký tự m đến ký tự n theo thứ tự trong ASCII
- `XY` : So khớp với 'X' theo sau là 'Y', ví dụ: [a-e][i-u]
- `X|Y` : So khớp X hoặc Y
- `\d` : So khớp với ký tự là chữ số, viết tắt của [0-9]
- `\D` : So khớp với ký tự không phải là chữ số, viết tắt của [^0-9]
- `\s` : So khớp với bất kỳ ký tự trống nào (dấu cách, tab, xuống dòng), viết tắt của [\t\n\x0B\f\r]
- `\S` : So khớp với bất kỳ ký tự không phải ký tự trống, viết tắt của [^\s]
- `\w` : So khớp bất kỳ ký tự chữ nào (chữ cái và chữ số), viết tắt của [a-zA-Z0-9]
- `\W`: So khớp bất kỳ ký tự nào không phải chữ cái và chữ số, viết tắt của [^\w]
- `\b` : Ranh giới của một từ
- `\B`: Không phải ranh giới của một từ
- `\A` : So khớp phần đầu của đầu vào
- `\G` : So khớp phần cuối của phần đầu vào
- `X*` : So khớp với 0 hoặc nhiều sự xuất hiện của X, viết gọn cho X{0,}
- `X+` : So khớp với 1 hoặc nhiều sự xuất hiện X, viết gọn cho X{1}
- `X{n}` : So khớp chính xác n lần sự xuất hiện của X
- `X{n,}` : So khớp n hoặc nhiều hơn số lần xuất hiện của X