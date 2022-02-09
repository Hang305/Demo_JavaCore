# Exception
### Exception Object:
- Là object đặc biệt. Khi ngoại lệ xảy ra Ọbject này sẽ chứa đựng các thông tin về lỗi.
- Exception là một sự kiện mà phá vỡ luồng chuẩn của chương trình.
### Check Exception 
- Những lỗi dev có thể đoán trước được.
- Bắt buộc dev phải bắt và xử lý **ngoại lệ** trong lúc compile time (lúc đang code)
- FileNotFoundException
- InterrupException
- Database Exception
- IO Exception
### Uncheck Exception
- Những lỗi xảy ra khi chương trình đang chạy và chúng ta không biết chắc nó có xảy ra hay không
- Dự đoán được có khả năng xảy ra lỗi ở những đoạn code nào từ đó bắt lỗi cho đoạn code đó.

### Kiến trúc của ngoại lệ 
- `Throwable`: là cha của tất cả **ngoại lệ** xảy ra trong chương trình bao gồm lỗi (**error**) và ngoại lệ (**Exception**)
- `Error`: là tất cả những lỗi được bắt từ JMV, ví dụ: OutOfMemory Exception -> môi trường thực thi, dừng chương trình
- `Exception`(Check): là cha của tất cả class Check Exception -> viết code
- `Exception Runtime` (Uncheck): là cha của tất cả các class Uncheck Exception -> đang chạy chương trình
### Xử lý Exception 
- Throws: apply check exception
- Try-Catch: chương trình không dừng - apply uncheck exception