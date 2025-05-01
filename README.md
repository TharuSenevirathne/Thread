# 🧵 Thread in Java


A Thread in Java is a unit of execution within a program. It allows multiple operations to run at the same time, which is known as multithreading. This improves performance and responsiveness, especially in applications that perform many tasks or handle multiple users. <br><br>

✅ Why Use Threads? <br><br>
--To perform multiple tasks simultaneously
--To make applications more responsive
--To better utilize CPU resources

🧰 How to Create Threads <br><br>
Threads can be created in two main ways:
--By extending the Thread class
--By implementing the Runnable interface
Both methods allow you to define a set of instructions that the thread will execute when started.

🔄 Thread Lifecycle <br><br>
A Java thread typically passes through these states:
--New – Thread is created but not yet started
--Runnable – Ready to run, waiting for CPU
--Running – Currently executing
--Blocked/Waiting – Temporarily paused
--Terminated – Execution finished

📌 Common Thread Methods <br><br>
--start() – starts the thread
--run() – contains the code that runs in the thread
--sleep() – pauses execution temporarily
--join() – waits for another thread to finish
--isAlive() – checks if the thread is still running
