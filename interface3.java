interface flyable
{
    void fly_obj();
}
class spacecraft implements flyable
{
    public void fly_obj()
    {
        System.out.println("Spacecraft flys to space");
    }
}
class airplane implements flyable
{
    public void fly_obj()
    {
        System.out.println("airplane goes shuuuuu");
    }
}
class helectoper implements flyable
{
    public void fly_obj()
    {
        System.out.println("helecopter helecopter");
    }
}