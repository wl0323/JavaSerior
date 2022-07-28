/**
 * @author shkstart
 * @create 2022-06-27-18:24
 */
public class enumtest {
}
enum day{
    MANDAY("周一","上班"),
    TRUDAY("周二","上班");


    private final String riqi;
    private   final String zhuaitai;
    private day(String riqi, String zhuaitai){
        this.riqi=riqi;
        this.zhuaitai=zhuaitai;

    }
}
