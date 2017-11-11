package com.deepak.algo;

public class Trimino{
		int size;
		int grid[][];
		int currentTriomino;
		public Trimino(int size,int x,int y){
		
			this.size=size;
			currentTriomino=1;
			grid=new int[size][size];
			init(grid,x,y);
		}
		private void init(int[][] grid, int x, int y) {

			for(int i=0;i<grid.length;i++){
				for(int j=0;j<grid.length;j++){
					if(i!=x && j!=y){
						grid[i][j]=0;
					}
				}
			}
			
			grid[x][y]=-1;
		}
		
		public void print(){
			
			for(int i=0;i<grid.length;i++){
				for(int j=0;j<grid.length;j++){
					System.out.print(grid[i][j]+ " ");
				}
				System.out.println();
			}
		}
		
		
	   public void startTiling(){
		   
		   renderTile(size, 0, 0);
	   }
	   
	   public void renderTile(int size,int topx,int topy){
		   
		   if(size==2){
			   
			   for(int i=0;i<size;i++){
				   for(int j=0;j<size;j++){
					   if(grid[topx+i][topy+j]==0)
					   grid[topx+i][topy+j]=currentTriomino;
				   }
			   }
			   
			   currentTriomino++;
		   }
		   
		   else {
			   
			      int defectX=topx,defectY=topy;
			      for(int i=0;i<size;i++){
					   for(int j=0;j<size;j++){
						   if(grid[i][j]!=0){
							   
							   defectX=i;defectY=j;
							   break;
						   }
						   
					   }
				   }
			      
			      if(defectX <topx+size/2 && defectY <topy+size/2){
			    	  
			    	   renderTile(size/2, topx, topy);
			    	   
			    	  
			    	   grid[topx+size/2][topy+size/2]=currentTriomino;
			    	   grid[topx+(size/2)-1][topy+size/2]=currentTriomino;
			    	   grid[topx+size/2][topy+(size/2)-1]=currentTriomino;
			    	   
			    	   currentTriomino++;
			    	   renderTile(size/2, topx, topy+size/2);
			    	   renderTile(size/2, topx+size/2, topy+size/2);
			    	   renderTile(size/2, topx+size/2, topy);
			      }
			      else if(defectX <topx+ size/2 && defectY >= topy+size/2){
			    	  
			    	  renderTile(size/2, topx, topy+size/2);
			    	  
			    	  grid[topx+size/2][topy+size/2]=currentTriomino;
			    	  grid[topx+(size/2)-1][topy+(size/2)-1]=currentTriomino;
			    	  grid[topx+size/2][topy+(size/2)-1]=currentTriomino;
			    	  
			    	  currentTriomino++;
			    	  renderTile(size/2, topx+size/2, topy+size/2);
			    	  renderTile(size/2, topx+size/2, topy);
			    	  renderTile(size/2, topx, topy);
			    	  
			      }
			      else if(defectX > topx +size/2 && defectY <topy + size/2){
			    	  
			    	  renderTile(size/2, topx+size/2, topy);
			    	  
			    	  grid[topx+size/2][topy+size/2]=currentTriomino;
			    	  grid[topx+(size/2)-1][topy+(size/2)-1]=currentTriomino;
			    	  grid[topx+(size/2)-1][topy+(size/2)]=currentTriomino;
			    	  
			    	  currentTriomino++;
			    	  renderTile(size/2, topx+size/2, topy+size/2);
			    	  renderTile(size/2, topx, topy+size/2);
			    	  renderTile(size/2, topx, topy);
			    	  
			      }
			      else if(defectX > topx +size/2 && defectY >=topy + size/2){
			    	  
			    	  renderTile(size/2, topx+size/2, topy+size/2);
			    	  
			    	  grid[topx+size/2][topy+(size/2)-1]=currentTriomino;
			    	  grid[topx+(size/2)-1][topy+(size/2)-1]=currentTriomino;
			    	  grid[topx+(size/2)-1][topy+(size/2)]=currentTriomino;
			    	  
			    	  currentTriomino++;
			    	  renderTile(size/2, topx+size/2, topy);
			    	  renderTile(size/2, topx, topy+size/2);
			    	  renderTile(size/2, topx, topy);
			      }
			      
			    
		   }
		   
	   }
	}
	
	
	
	

