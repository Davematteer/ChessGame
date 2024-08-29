import Chessboard

public abstract class Piece{
  protected Position position;
  protected Piececolor color;

  public Piece(Piececolor color, Position position){
    this.color = color;
    this.position = position;
  }

  public Piececolor getColor(){
    return color;
  }
  
  public Position getPosition(){
    return position;
  }

  public Position setPosition(){
    this.position = position;
  }

  public abstract boolean isValidMove(Position newPosition, Piece[][] board);

}
