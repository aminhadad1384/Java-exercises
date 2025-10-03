public class tasks {
    enum status {
        completed,
        not_completed
    }

    String description;
    status Status_task;
    static tasks[] task_array = new tasks[1000];
    static int task_counter = 0;

    public tasks(String des) {
        this.description = des;
        this.Status_task = status.not_completed;
    }

    public static void add_task(tasks tsk) {
        task_array[task_counter] = tsk;
        task_counter++;
    }

    public static void mark_iscompleted(int task_number) {
        task_array[task_number].Status_task = status.completed;
    }

    public static void view_tasks() {
        for (int i = 0; i < task_counter; i++) {
            System.out.println("\t task description\t||\t task status ");
            System.out.println((i + 1) + "\t" + task_array[i].description + "\t||\t" + task_array[i].Status_task);
        }
    }
}