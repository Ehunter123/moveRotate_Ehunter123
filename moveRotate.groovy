//Move and rotate opperations
double size =120;
CSG cube = new Cube(size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
		
CSG movedCube = cube
			.movex(80)
			.movey(20)
			.movez(30)
//rotate
movedCube = movedCube
			.rotx(15)
			.roty(20)
			.rotz(30)
//set colors
cube.setColor(javafx.scene.paint.Color.CYAN);

return [cube,movedCube]