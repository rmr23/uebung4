
public class RobotSpielerAdapter implements Spieler{
	private Robot Robot;
	public RobotSpielerAdapter(Robot robot) {
		this.Robot = robot;
	}
	
	@Override
	public int geheNachLinks(int distanz) {
		double pX = (double) this.Robot.getX()-distanz;
		double pY = (double) this.Robot.getY();
		Robot.rolleNach(pX,pY);
        return (int) this.Robot.getX();
	}
	@Override
    public int geheNachRechts(int distanz) {
		double pX = (double) this.Robot.getX()+distanz;
		double pY = (double) this.Robot.getY();
		Robot.rolleNach(pX,pY);
        return (int) this.Robot.getX();
    }
    
    @Override
    public int geheNachOben(int distanz) {
		double pX = (double) this.Robot.getX();
		double pY = (double) this.Robot.getY() + distanz;
		Robot.rolleNach(pX,pY);
        return (int) this.Robot.getY();
    }
    @Override
    public int geheNachUnten(int distanz) {
		double pX = (double) this.Robot.getX();
		double pY = (double) this.Robot.getY()-distanz;
		Robot.rolleNach(pX,pY);
        return (int) this.Robot.getY();
    }
}
