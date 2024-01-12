package collection.day11;

import java.util.ArrayList;
import java.util.List;

// 1월 14일 저녁 9시까지 제출
public class CustomerMangerApp {
    // JavaWordApp V2 형식으로 하세요.
    private List<Customer> apps = new ArrayList<>();

    private void start() {
        initialize();
        // 메뉴 선택 : 등록, 검색(이름/그룹), 삭제, 수정, 전체출력
        System.out.println("고객 등급 프로그램을 실행합니다.");
        while (true) {
            System.out.println("\t 메뉴를 선택하세요!!\n");
            System.out.println("\t 1) 고객 등록");
            System.out.println("\t 2) 고객 검색 (이름/그룹)");
            System.out.println("\t 3) 고객 정보 삭제");
            System.out.println("\t 4) 고객 정보 수정");
            System.out.println("\t 5) 고객 리스트 출력");
            System.out.println("\t 6) 프로그램을 종료합니다");
            System.out.println("선택 > > > ");
            int select = Integer.parseInt(System.console().readLine());

            switch (select) {
                case 1:
                    addApp(); // 고객 등록
                    break;
                case 2:
                    searchApp(); // 고객 검색
                    break;
                case 3:
                    removeApp(); // 고객 삭제
                    break;
                case 4:
                    setApp(); // 고객 수정
                    break;
                case 5:
                    listApp(); // 고객 리스트 출력
                    break;
                case 6:
                    listApp();
                    System.out.println("\t프로그램을 종료합니다. ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t잘못된 선택값 입니다.");
                    break;
            }

        }
    }

    private void initialize() {
        apps.add(new Customer("권삐삐", "010-0000-1111", 1));
        apps.add(new Customer("이무무", "010-1111-2222", 1));
        apps.add(new Customer("장또또", "010-2222-3333", 2));
        apps.add(new Customer("전뿌뿌", "010-3333-4444", 2));
        apps.add(new Customer("김까까", "010-4444-5555", 3));
    }

    // 고객 정보 삭제
    private void removeApp() {
        System.out.println("\t >> 고객님의 정보를 삭제합니다. <<");
        System.out.println("\t삭제할 고객님의 이름을 입력해주세요! > > >");
        String find = System.console().readLine();
        boolean isFind = false;
        for (int i = 0; i < apps.size(); i++) {
            if (apps.get(i).getName().equals(find)) {
                isFind = true;
                System.out.println("\t >> 리스트" + i + "에서 단어를 찾았습니다. <<");
                System.out.println("\t>> 삭제하려면 엔터, 취소는 n을 입력하세요. <<");
                if (System.console().readLine().equals("n"))
                    continue;
                else {
                    apps.remove(i);
                    System.out.println("\t >> 삭제 완료 !!! << ");
                    // 단어 삭제
                }
            } // if end
        } // for end
        if (!isFind)
            System.out.println("\t\t>> 등록되어있지 않은 고객 정보 입니다.<< ");
    }

    // 이름으로 검색
    private List<Customer> searchNameApp(String name) {
        List<Customer> list = new ArrayList<>();
        for (Customer app : apps) {
            if (app.getName().equals(name)) {
                list.add(app);
            }
        }
        return list;
    }

    // 고객 정보 검색
    private void searchApp() {
        System.out.println("\t >> 고객님의 정보를 검색합니다.(이름 조회는 1번, 그룹 조회는 2번) <<");
        String find = null;
        List<Customer> list = null;
        switch (System.console().readLine()) {
            case "1":
                System.out.println("\t\t>> 검색할 고객님의 이름을 적어주세요. <<");
                find = System.console().readLine();
                list = searchNameApp(find);
                break;
            case "2":
                System.out.println("\t\t>> 검색할 그룹 번호를 적어주세요. <<");
                int group = Integer.parseInt(System.console().readLine());
                list = searchGroupApp(group);
                break;
            default:
                System.out.println(">> 1번 또는 2번만 적어주세요. <<");
                break;
        }
        System.out.println("\t\t>> 찾으시는 고객 정보 입니다.\n<<");
        System.out.println(String.format("%22s %20s %20s", "NAME", "PHONE", "GROUP\n"));
        if (list.size() == 0)
            System.out.println(">> 찾는 고객님의 정보가 없습니다 << ");
        else
            printAppList(list);
    }

    // 그룹 번호로 검색
    private List<Customer> searchGroupApp(int group) {
        List<Customer> list = new ArrayList<>();
        for (Customer app : apps) {
            if (app.getGroup() == group) {
                list.add(app);
            }
        }
        return list;
    }

    private void printAppList(List<Customer> list) {
        for (Customer app : list) {
            System.out.println(String.format("%20s %20s %15s", app.getName(), app.getPhone(), app.getGroup()));
        }
    }

    // 고객 리스트 출력
    private void listApp() {
        System.out.println("\t\t>> 고객 리스트를 출력합니다. <<");
        System.out.println(String.format("%22s %20s %20s", "NAME", "PHONE", "GROUP"));
        printAppList(apps);
    }

    // 고객 정보 수정
    public void setApp(){
    List<Customer> list =new ArrayList<>();
    String find = null;
    System.out.println("\t >> 고객님의 정보를 수정합니다, << \n");
    switch (System.console().readLine()) {
        case "1":
        System.out.println("\t >> 수정할 고객님의 이름을 적어주세요 << \n");
            find = System.console().readLine();
            list = searchNameApp(find);
                break;

            list.set(0, ) System.out.println("\t >> 리스트에서 고객님의 정보를 찾았습니다. <<\n")
        default :
                System.out.println("\t\t>> 등록되어있지 고객님 입니다.<< "); 
                break;        
        }
    }
    // 고객 정보 등록
    private void addApp() {
        System.err.println("\t >> 고객 등록입니다. << ");
        System.err.println("\t >> 고객님의 이름을 적어주세요.__ << ");
        String name = System.console().readLine();
        System.out.println("\t >> 고객님의 번호를 적어주세요.__ <<");
        String phone = System.console().readLine();
        System.out.println("\t >> 고객님의 그룹을 적어주세요.(1. 일반 2. VIP 3. 기타) __ <<");
        int group = Integer.parseInt(System.console().readLine());
        apps.add(new Customer(name, phone, group));
    }

    public static void main(String[] args) {
        CustomerMangerApp app = new CustomerMangerApp();
        app.start();
    }

}
