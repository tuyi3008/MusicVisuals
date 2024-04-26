# Music Visualiser Project

Name: Yi Tu

Student Number: C22365356

## Instructions

Music has the remarkable ability to evoke emotions, spark creativity, and transport listeners to different realms of experience. While the auditory experience of music is undoubtedly powerful, the addition of visual elements through music visualization can further enrich the listening experience by providing a multi-sensory journey into the world of sound.

In this report, we explore a music visualization program developed using the Processing programming language. This program offers a dynamic and interactive visualization of audio spectrum data in real-time, allowing users to observe and interact with the underlying rhythm and structure of the music they are listening to.

Through the combination of audio synthesis and analysis techniques provided by the Minim library, as well as the visual rendering capabilities of Processing, our program transforms audio signals into vibrant visual displays. Users can choose from various visualization modes, including bars, circles, and dynamic geometry, each offering a unique perspective on the music.

Join us on a journey through the realms of sound and vision as we delve into the workings of this music visualization program and explore its potential to enhance the listening experience through immersive visualizations of music.

# Description of the assignment

The assignment entails the development of a music visualization program using Java and the Processing library. The program is designed to visualize audio input in real-time, providing an engaging and dynamic display that reflects the characteristics of the music being played.

The core functionality of the program involves processing audio data from an input file (in this case, "heroplanet.mp3") using the Minim library. This includes loading the audio file, analyzing its frequency spectrum using Fast Fourier Transform (FFT), and extracting relevant data for visualization.

The visualization is implemented using various graphical elements, including circles, bars, and dynamic geometry. Each visualization mode offers a unique representation of the music, with visual elements reacting to different aspects of the audio signal, such as amplitude, frequency, and rhythm.

Circles Mode: Colorful circles dynamically move across the screen, changing in size and position based on the music's rhythm and intensity. The color and motion of the circles are synchronized with the audio spectrum, providing a visually captivating representation of the music.
Bars Mode: Horizontal bars are displayed on the screen, with their heights fluctuating in response to the audio spectrum. Each bar represents a specific frequency band, and its height corresponds to the magnitude of that frequency component in the music. The bars move horizontally across the screen, creating a dynamic visual effect that reflects the changing audio signal.
Dynamic Geometry Mode: Triangles are dynamically generated and displayed on the screen, with their size, color, and position determined by the music's frequency spectrum. As the music plays, the triangles change in size and color, creating an abstract and visually stimulating display that evolves in real-time.
The program also includes user interaction features, allowing users to switch between visualization modes using keyboard input. By pressing different keys ('1' for circles, '2' for bars, '3' for dynamic geometry), users can explore and interact with the various visualization modes, experiencing the music in a visually immersive way.

Overall, the assignment aims to showcase the creative potential of audio visualization techniques, providing students with an opportunity to apply their programming skills to create an engaging and interactive music visualization program.

# Song Choice Reason

I selected the track "It's in the Stories That We Say" for its strong rhythmic qualities and engaging beats. This song resonates with me due to its dynamic rhythm, characterized by lively percussion and pulsating melodies. I believe that such energetic music is ideal for generating visually captivating experiences.

# Emotion and Structure of the Song

"It's in the Stories That We Say" evokes a sense of excitement, vigor, and momentum. The driving rhythm and vibrant instrumentation create an atmosphere charged with adrenaline, reminiscent of embarking on an adventurous journey. Structurally, the song maintains a brisk pace, with alternating musical motifs that contribute to its dynamic nature.

# Visualization Process


The visualization process in the music visualization program involves transforming audio input into dynamic graphical representations that reflect different aspects of the music. This process consists of several key steps, including audio analysis, data processing, and graphical rendering.

Audio Analysis: The visualization process begins with the analysis of the audio input using the Fast Fourier Transform (FFT) algorithm. This algorithm decomposes the audio signal into its frequency components, revealing the distribution of energy across different frequency bands. The result is a frequency spectrum that represents the amplitude of each frequency band in the audio signal.
Data Processing: Once the frequency spectrum is obtained, the program processes this data to extract relevant information for visualization. Depending on the chosen visualization mode (circles, bars, or dynamic geometry), different parameters are derived from the frequency spectrum to control the behavior and appearance of graphical elements.
Graphical Rendering: With the processed data in hand, the program renders graphical elements on the screen to visualize the music. In the circles mode, colorful circles are dynamically positioned and resized based on the amplitude of frequency bands. In the bars mode, horizontal bars move across the screen, with their heights fluctuating in response to the audio spectrum. In the dynamic geometry mode, triangles are dynamically generated and displayed, with their size, color, and position determined by the frequency spectrum.
Dynamic Updates: Throughout the visualization process, the program continuously updates the graphical elements in real-time to synchronize them with the changing audio signal. This ensures that the visualization remains responsive and engaging, capturing the nuances of the music as it plays.
User Interaction: The visualization process also includes user interaction features, allowing users to switch between different visualization modes using keyboard input. This enables users to explore and interact with the visualization, customizing their experience based on personal preferences and musical taste.
Overall, the visualization process transforms audio input into visually captivating displays that enhance the listening experience, offering users a dynamic and immersive way to engage with music.

# Code Correspondence with Music

The code corresponds with the music by analyzing its audio spectrum in real-time using the Fast Fourier Transform (FFT) algorithm. This algorithm breaks down the audio signal into its frequency components, allowing the program to extract information about the intensity of different frequency bands. The extracted data is then mapped to various visual elements, such as circles, bars, and triangles, which dynamically respond to changes in the music's rhythm, melody, and intensity. For example, the size and color of the shapes may vary based on the amplitude and frequency of the corresponding audio bands. As the music plays, the visual elements evolve and interact, creating a synchronized and immersive experience that enhances the listener's engagement with the music.


# How it works

# What I am most proud of in the assignment

What I am most proud of in this assignment is the synchronization between the visual elements and the music. Achieving this required a deep understanding of signal processing techniques, particularly the FFT algorithm, and creative programming to translate the audio data into visually engaging shapes and colors. I am proud of how the visualizations respond dynamically to changes in the music, capturing the essence of the sound and enhancing the overall listening experience. Additionally, I am pleased with the versatility of the program, allowing users to switch between different visualization modes seamlessly, adding to the interactivity and enjoyment of the application. Overall, I take pride in the combination of technical skill and creativity that went into creating a visually stunning and synchronized music visualization experience.


This is a [hyperlink](http://bryanduggan.org)

This is the visual 1(drawCircles) code:

```Java
if (showCircles) {
            // Draw colorful shapes based on music
            for (int i = 0; i < numCircles; i++) {
                float x = width / 2 + cos(angles[i]) * distances[i];
                float y = height / 2 + sin(angles[i]) * distances[i];
                float size = fft.getBand(i % numCircles) * 10;

                // Adjust the size of shapes according to the rhythm of the music
                size *= map(sin(frameCount * 0.1f), -1, 1, 0.4f, 0.7f);

                // Adjust shape color to match the emotion of the music
                float hue = map(fft.getBand(i % numCircles), 0, 255, 0, 360);
                float saturation = 100;
                fill(hue, saturation, brightness);

                noStroke();
                ellipse(x, y, size, size);

                angles[i] += speeds[i];
                if (distances[i] > maxDistance || distances[i] < 0) {
                    speeds[i] *= -1;
                }
                distances[i] += speeds[i] * 10;
            }
        }
```


This is the visual 2(drawBars) code:

```
public void drawBars() {
        for (int i = 0; i < numBars; i++) {
            float barWidth = width / numBars;
            float x = i * barWidth;
            float barHeight = fft.getBand(i % numBars) * 10;
            barWidths[i] = barWidth + fft.getBand(i % numBars); // Increase bar width based on amplitude
            fill(barColors[i]); // Use random color for each bar
            rect(x, height - barHeights[i], barWidths[i], barHeight);
            barHeights[i] += barSpeeds[i]; // Increase bar height according to its speed
            if (barHeights[i] > height) { // Reset bar height when it reaches the bottom
                barHeights[i] = 0;
            }
        }
    }


```


This is the visual 3(showGeometry) code:

```
public void showGeometry() {
        float centerX = width / 2;
        float centerY = height / 2;

        float amplitude = 20; // Amplitude for triangle size
        float rotationSpeed = 0.01f; // Speed of rotation
        float maxRotation = PI / 2; // Maximum rotation angle
        float rotation = 0; // Initial rotation angle

        TriangleColors = new int[numTriangle];

        int spectrumSize = fft.specSize(); // Get size of spectrum data

        float step = TWO_PI / numTriangle; // Angle step between shapes

        for (int i = 0; i < numTriangle; i++) {
            float angle = i * step;
            float spectrumValue = fft.getBand(i % spectrumSize); // Get spectrum value for current band
            float radius = spectrumValue * amplitude;

            TriangleColors[i] = color(random(255), random(255), random(255));

            // Calculate vertices of triangle
            float x1 = centerX + cos(angle + rotation) * radius;
            float y1 = centerY + sin(angle + rotation) * radius;

            float x2 = centerX + cos(angle + rotation + TWO_PI / 3) * radius;
            float y2 = centerY + sin(angle + rotation + TWO_PI / 3) * radius;

            float x3 = centerX + cos(angle + rotation + 2 * TWO_PI / 3) * radius;
            float y3 = centerY + sin(angle + rotation + 2 * TWO_PI / 3) * radius;

            // Calculate shape color
            // float hue = map(i, 0, numTriangle, 0, 255); // Use different hue values
            // float saturation = map(spectrumValue, 0, 255, 50, 100); // Set saturation
            // float brightness = map(spectrumValue, 0, 255, 20, 80); // Set brightness
            // fill(hue, saturation, brightness);
            fill(TriangleColors[i]);

            // Draw triangle
            triangle(x1, y1, x2, y2, x3, y3);
        }

```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

# Here are the mode 1 images

![A different image]![Screenshot 2024-04-26 022821](https://github.com/tuyi3008/MusicVisuals/assets/73605412/a5f2973c-81b0-444c-8f76-c1d56bb0f6a5)



![A different image]![Screenshot 2024-04-26 022845](https://github.com/tuyi3008/MusicVisuals/assets/73605412/bfa3ad69-9c51-4ce5-b0f3-24c3953395b6)


![A different image]![Screenshot 2024-04-26 023030](https://github.com/tuyi3008/MusicVisuals/assets/73605412/9c33d5f9-2e0e-4480-9a4c-03632adb717d)



![A different image]![Screenshot 2024-04-26 023112](https://github.com/tuyi3008/MusicVisuals/assets/73605412/79c15cd6-b51d-4c9d-a06b-dbe94adf2b71)


![A different image]![Screenshot 2024-04-26 023157](https://github.com/tuyi3008/MusicVisuals/assets/73605412/02774b4f-a0a4-4e55-9b26-e32fc0f77018)


![A different image]![Screenshot 2024-04-26 023203](https://github.com/tuyi3008/MusicVisuals/assets/73605412/e78b7328-1037-4398-9b0c-cac889d67e4e)


![A different image]


![A different image]![Screenshot 2024-04-26 023231](https://github.com/tuyi3008/MusicVisuals/assets/73605412/40ce29b6-5e88-4cce-bb96-c9fe28b1765b)



# Here are the mode 2 images

![A different image]![Screenshot 2024-04-26 023302](https://github.com/tuyi3008/MusicVisuals/assets/73605412/7cc0c890-6d0d-42fb-b05e-b1a762da465a)


![A different image]![Screenshot 2024-04-26 023231](https://github.com/tuyi3008/MusicVisuals/assets/73605412/40ce29b6-5e88-4cce-bb96-c9fe28b1765b)


# Here are the mode 3 images


![A different image](![Screenshot 2024-04-26 023320](https://github.com/tuyi3008/MusicVisuals/assets/73605412/f5d4dbf9-bb88-415b-b485-166e2cc48751)
)


![A different image](![Screenshot 2024-04-26 023425](https://github.com/tuyi3008/MusicVisuals/assets/73605412/2b6093f7-3386-4dfd-9dc7-138e08cd3737)
)

![A different image]![Screenshot 2024-04-26 023739](https://github.com/tuyi3008/MusicVisuals/assets/73605412/f74ae48f-4d96-42ef-8258-315d371a35b1)


![A different image]![Screenshot 2024-04-26 024027](https://github.com/tuyi3008/MusicVisuals/assets/73605412/367bd9fe-9a49-4eb3-8643-08bc356bfb89)

![A different image]![Screenshot 2024-04-26 024054](https://github.com/tuyi3008/MusicVisuals/assets/73605412/3ae8339d-8479-4345-8a6a-dcfe91359ab0)




This is a youtube video:

[![YouTube](https://github.com/tuyi3008/MusicVisuals/assets/73605412/d2ffb65f-179c-4c6e-9f1a-f3da163496ca)
]()

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

