# Lab 2

## Scenario

Code&Code is a small company dedicated to Software Development. Their engineering team, to which you belong, is working on writing a Web Application as an MVP for a new customer.

The code name for this App is “Loggy”, which is meant to offer functionality for a personal journal where users can log their daily activities through text, voice and video.

The first step will be to write the main functionality, which is essentially a Microblogging System where all the posts are automatically annotated with voice, video or text.

As an initial step, you must create the skeleton of the back-end service for performing the automatic closed captioning under these assumptions:

- The closed captioning is performed through an external service (AWS or GCloud).

- There should be an internal controller that:

- Receives the recordings to be processed from a requester

- Sends the recordings to the external service

- Receives its response

- Updates the recoding with the resulting closed captioning; and

- Responds back to the requester

- The recordings can be processed simultaneously, but there is a limit of only 5 concurrent processes that can be handled by the sender.

- Therefore, there should be a queue that will act as a buffer for the overhead.

- Once the recording is processed, the external service responds with a callback, therefore a listener should be ready to receive that request and update the object with a text file containing the strings for the closed captioning.

- Only audio and video can be processed.

- The processing time depends of the length of the recording.

## Tasks

### Main class

1. Write a Main class that you will use as the simulator for testing you Classes

### Multithreading

2. Write the class log that will be used as a base for the modeling. The class log is an abstraction of what logs can do: create, read, update, and delete. Logs also include specific characteristics like name, description and date. They also include, by default, a unique internal ID and a unique short code (in the form abc-abc-abc) is assigned.

3. Implement some mockup output for the methods create, read, update, delete.

4. Instances of the class log should be created assigning one, some or none of the attributes. Write constructors.

5. Write the class that will simulate the recording to be processed, which contains an id, the media, a length and the strings for closed captioning.

6. Write a class that will be the actual controller (or spooler).

7. Write a class that will act as the worker for processing closed captioning though an external service

8. Implement the queue and callback actions.

Remember that although the scenario and resulting model may be used for future activities, the main goal is to practice what you have learned in this module, so do not be worried about finding the perfect solution for this case. And keep in mind that System.out.println() will be enough for the purposes of illustrating your model.
