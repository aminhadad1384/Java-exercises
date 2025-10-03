import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class todolist {
    public static void main(String[] args) {
        System.out.println(
                "hi welcome to my app\n enter the number of your what you want to do :\n 1:add task \n 2:mark task as completed \n 3:view tasks \n 4:exit from app\n");
        Scanner input = new Scanner(System.in);
        int number_user_want_to_do = input.nextInt();
        while (number_user_want_to_do != 4) {
            switch (number_user_want_to_do) {
                case 1:
                    System.out.println("write your description of this task to add ");
                    input.nextLine();
                    String task_description = input.nextLine();
                    tasks task_to_add = new tasks(task_description);
                    tasks.add_task(task_to_add);
                    System.out.println("this task is added :)");
                    break;
                case 2:
                    System.out.println("choose number of that task you want to be completed task :");
                    for (int i = 0; i < tasks.task_counter; i++) {
                        System.out.println((i + 1) + " : " + tasks.task_array[i].description);
                    }
                    int task_number = input.nextInt();
                    tasks.mark_iscompleted(task_number - 1);
                    break;
                case 3:
                    tasks.view_tasks();
                    break;
                default:
                    System.out.println("unknown number ");
                    break;
            }
            System.out.println(
                    "\n\n\n enter the number of your what you want to do :\n 1:add task \n 2:mark task as completed \n 3:view tasks \n 4:exit from app\n\n");
            number_user_want_to_do = input.nextInt();
        }
    }
}