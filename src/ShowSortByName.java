public class ShowSortByName<T extends LiveBeing<T>> implements ICommand {
    private FamilyTreeView<T> familyTreeView;

    @Override
    public void execute() {
        familyTreeView.showAllByName();
    }

    @Override
    public String discription() {
        return "Сортировать по имени и показать";
    }

}