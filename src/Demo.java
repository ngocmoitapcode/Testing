/*
 * Một học sinh thi THPTQG cần ba môn Toán, Ngữ Văn, Tiếng Anh. Biết để đỗ NV1 cần tổng ba môn tối thiểu 26 điểm.
 */
public class Demo {
    public String sumPoint(double math, double literature, double english) {
        if (math + literature + english > 30.0 || math + literature + english < 0.0) {
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
