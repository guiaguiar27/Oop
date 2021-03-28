package Pract3;

public class SoftDrink {
    public String Name; 
    private float Price ;   
    
    public void setName(String newName){ 
        this.Name = newName ; 
    }
    public void SetPrice(float newPrice){ 
        this.Price = (float) newPrice; 
    } 
    public float GetPrice(){ 
        return Price; 
    }
}
