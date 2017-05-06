package model;

import com.github.bingoohuang.excel2beans.annotations.ExcelColTitle;
import com.github.bingoohuang.excel2beans.annotations.ExcelSheet;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@ExcelSheet(name = "订课情况")
public class Subscribe {
    @ExcelColTitle("订单日期")
    private Timestamp day;
    @ExcelColTitle("人次")
    private int times;
    @ExcelColTitle("人数")
    private int heads;
}
