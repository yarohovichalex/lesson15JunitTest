package by.yarohovich.FlowerShop;

public class Bud {
	private Leaf leaves[];
	private String color;
	private int size;
	private int num;
	
	public Bud(int size) {
		this.size = size;
		this.color = "green";
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public void addFreshLeaves(int num) {
		if(num >= 0) {
			leaves = new Leaf[num];
			for (int i = 0; i < num; i++) {
			leaves[i] = new Leaf("white","elipse","",i+1);
			}
		}
	}
	
	public void deleteOneLeaves() {
		if(leaves != null) {
			leaves = new Leaf[leaves.length - 1];
			for (int i = 0; i < leaves.length; i++) {
				leaves[i] = new Leaf("white","elipse");
			}
		}		
	}
	
	public void deleteLeaves() {
		leaves = new Leaf[0];
	}

	public Leaf[] getLeaves() {
		return leaves;
	}
        public int getNumLeaves(){        	
            return leaves.length;
        }
        public void setValueLeaves(int i, String s){
            this.leaves[i].setValue(s);
        }
        public String getValueLeavesById(int id){
            for (int i = 0; i < this.leaves.length; i++) {
                if(this.leaves[i].getId() == id){
                    return leaves[i].getValue();
                }
            }
            return null;
        }
        public void deleteLeavesById(int id){
            for (int i = 0; i < this.leaves.length; i++) {
                Leaf []oldLeaves = this.leaves;
                if(this.leaves[i].getId() == id){
                    System.out.println("udalyem elem so znach " + leaves[i].getValue());
                    leaves = new Leaf[leaves.length-1];
                    for (int j = 0; j < leaves.length; j++) {
                        leaves[j] = oldLeaves[j + 1];
                    }                   
                }
            }            
        }
        public void deleteLeavesByIdAlter(int id){
             for (int i = 0; i < this.leaves.length; i++) {
                 if(this.leaves[i] != null && this.leaves[i].getId() == id){
                     this.leaves[i] = null;
                 }
             }
        }
        public void printLostLeaf(){
            for (int i = 0; i < this.leaves.length; i++) {
                if(this.leaves[i] != null){
                    System.out.println(leaves[i].getValue() + " ds");
                }
            }
        }
//        public void deleteNullLeaves() {
//        	ArrayList<Leaf> al = new ArrayList<>();
//        	for (int i = 0; i < leaves.length; i++) {
//				if(this.leaves[i] != null) {
//					al.add(leaves[i]);
//					Leaf [] array = al.toArray(new Leaf[al.size()]);
////					Leaf oldArr[] = this.leaves;
////					this.leaves = new Leaf[leaves.length - 1];
////					for (int j = 0; j < leaves.length; j++) {
////						leaves [j] = oldArr[j+1];
////					}					
//				}
//			}
//        }
    }