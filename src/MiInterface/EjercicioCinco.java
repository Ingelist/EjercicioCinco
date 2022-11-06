package MiInterface;

public class EjercicioCinco {
    public interface CocheCRUD{
        void save();
        void delete();
        void  findAll();
    }
    public static class CocheCRUDImpl implements CocheCRUD{
        //sobre escritura generada por intellij
        @Override
        public void save() {

        }

        @Override
        public void delete() {

        }

        @Override
        public void findAll() {

        }

        String save = "Guardar";
        String delete = "Borrar";
        String findAll = "Buscar";
// sobre escritura toString generado por intellij
        @Override
        public String toString() {
            return "CocheCRUDImpl{" +
                    "save='" + save + '\'' +
                    ", delete='" + delete + '\'' +
                    ", findAll='" + findAll + '\'' +
                    '}';
        }
//método main generado por intellij
        public static void main(String[] args) {
            CocheCRUD cocheCRUD = new CocheCRUDImpl();
            System.out.println(cocheCRUD);
        }
    }
}
