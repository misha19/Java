/**
 * Created by me on 12/25/17.
 */
public class PaperTray {

    int pages = 0 ;
    public void addPaper(int count){
        pages += count;
    }
    public void usePage() {
        pages--;
    }
    public boolean isEmpty()
    {
        return pages > 0 ;
    }
}
