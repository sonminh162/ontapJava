public class News implements INews{
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    float averageRate;

    static int[] rateList = {3,5,7};

    public News(String title, String publishDate, String author, String content) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println("title"+getTitle()+"publishDate"+getPublishDate()+"author"+getAuthor()+"content"+getContent()+"averageRate"+getAverageRate());
    }

    public void calculate(){
        averageRate = (rateList[0]+rateList[1]+rateList[2])/3;
    }
}
