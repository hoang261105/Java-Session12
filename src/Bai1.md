| **Tiêu chí**           | **Overloading (Nạp chồng phương thức)**                                        | **Overriding (Ghi đè phương thức)**                               |
|------------------------|----------------------------------------------------------------------------|---------------------------------------------------------------|
| **Khái niệm**          | Là việc định nghĩa nhiều phương thức cùng tên trong cùng một lớp, nhưng khác nhau về số lượng hoặc kiểu tham số. | Là việc định nghĩa lại phương thức của lớp cha trong lớp con, giữ nguyên tên, kiểu trả về, và danh sách tham số. |
| **Thời điểm quyết định** | Được quyết định tại **compile-time** (thời gian biên dịch). | Được quyết định tại **runtime** (thời gian chạy). |
| **Sự liên quan đến đối tượng** | Xảy ra trong **cùng một lớp** (không liên quan đến kế thừa). | Xảy ra giữa **lớp cha và lớp con** (liên quan đến kế thừa). |
| **Số lượng tham số**   | Bắt buộc **khác nhau** về số lượng hoặc kiểu dữ liệu của tham số. | Phải **giống nhau** hoàn toàn về số lượng, kiểu dữ liệu tham số và kiểu trả về. |
| **Mục đích sử dụng**   | Cung cấp tính linh hoạt bằng cách tạo nhiều phiên bản của cùng một phương thức với các cách xử lý khác nhau. | Cung cấp khả năng tùy chỉnh hoặc mở rộng hành vi của phương thức trong lớp con mà không thay đổi lớp cha. |
