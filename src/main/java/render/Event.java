package render;

/**
 * An event is something that can be queued for the Render engine to run
 * The main point of this is to solve concurrency issues when running the engine in a separate thread
 */
public interface Event {
    /**
     * All code inside the run() method will be executed once the queue gets to it
     */
    void run();
}
