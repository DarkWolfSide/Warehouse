import java.util.List;
public class Warehouse {
    List<Material> materials;
    int playerId;
    public void addMaterial(Material material){
        for(int i = 0;i<materials.size();++i){
            if(materials.get(i).getName().equals(material.getName())){
                materials.get(i).setQuantity(materials.get(i).getQuantity() + 1);
                return;
            }

        }
        material.setQuantity(material.getQuantity()+1);
        materials.add(material);
    }
    public void removeMaterial(Material material){
        for(int i = 0;i<materials.size();++i){
            if(materials.get(i).getName().equals(material.getName())){
                materials.get(i).setQuantity(materials.get(i).getQuantity() - 1);
                if(materials.get(i).getQuantity() == 0){
                    materials.remove(i);
                }
                return;
            }

        }
    }

}
