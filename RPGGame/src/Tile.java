
class Tile {

	// PIECES
	// @ - Player
	// . - Path
	// | - Wall
	
	char[] piece = {'P','.','|'};
	
	int type;
	char view;
	
	Tile(int t)
	{
		this.type = t;
		this.view = piece[t];
	}
}
