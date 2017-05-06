import com.github.bingoohuang.excel2beans.BeansToExcel;
import com.google.common.collect.Lists;
import lombok.Cleanup;
import lombok.val;
import model.Subscribe;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

public class BeansToExcelTest {
    public static void main(String[] args) throws IOException {
        List<Subscribe> subscribes = Lists.newArrayList();
        subscribes.add(new Subscribe(Timestamp.valueOf("2007-01-11 12:13:14"), 100, 10));
        subscribes.add(new Subscribe(Timestamp.valueOf("2007-02-11 12:13:14"), 101, 11));
        subscribes.add(new Subscribe(Timestamp.valueOf("2007-03-11 12:13:14"), 102, 12));
        BeansToExcel beansToExcel = new BeansToExcel();
        Workbook workbook = beansToExcel.create(subscribes);
        @Cleanup val fileOut = new FileOutputStream("test.xls");
        workbook.write(fileOut);
    }
}
