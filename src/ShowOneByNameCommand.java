public class ShowOneByNameCommand<T extends LiveBeing<T>> implements ICommand {
    private FamilyTreeView<T> familyTreeView;

    @Override
    public void execute() {
        familyTreeView.showOneByName();
    }

    @Override
    public String discription() {
        return "4 - Найти объект по имени и показать первый найденный";
    }
}