# Doctor-Patient Queue Waiting-Time Estimator

A small Java utility that models multiple doctors serving patients in parallel and computes an individual patient’s estimated waiting time based on current queue lengths and average consultation times.

---

## How It Works

1. **Initial assignment**  
   - If the new patient’s ticket number is ≤ the number of doctors, they see a doctor immediately (wait time = 0).

2. **Priority queue setup**  
   - Each `Doctor` object carries:  
     - `avgTime` (average consultation time)  
     - `currentQueueTime` (time until this doctor is free of already-assigned patients)  
   - We order doctors by:
     1. smallest `currentQueueTime`  
     2. tie-breaker: smaller `avgTime`

3. **Simulate queue advancement**  
   - Subtract the number of doctors from the ticket number (those first patients start immediately).  
   - For each remaining patient ahead in line, poll the doctor who becomes free soonest, add one consultation (their `avgTime`) to that doctor’s `currentQueueTime`, then push back into the heap.  

4. **Result**  
   - Once you have assigned all patients ahead of John, the head of the heap holds the earliest next-free time. That is John’s estimated wait.

---
