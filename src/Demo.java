/*
 * Một học sinh thi THPTQG cần ba môn Toán, Ngữ Văn, Tiếng Anh. Biết để đỗ NV1 cần tổng ba môn tối thiểu 26 điểm.
 */
public class Demo {
    public String sumPoint(double math, double literature, double english) {
        if (math < 0 || math > 10) {
            return "Không hợp lệ";
        }
        else if (literature < 0 || literature > 10) {
            return "Không hợp lệ";
        }
        else if (english < 0 || english > 10) {
            return "Không hợp lệ";
        }
        else if(math + literature + english >= 26.0 ) {
            return "Đỗ";
        }
        else {
            return "Trượt";
        }
    }
}
