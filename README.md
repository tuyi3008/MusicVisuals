# Music Visualiser Project

Name: Yi Tu

Student Number: C22365356

## Instructions

Music has the remarkable ability to evoke emotions, spark creativity, and transport listeners to different realms of experience. While the auditory experience of music is undoubtedly powerful, the addition of visual elements through music visualization can further enrich the listening experience by providing a multi-sensory journey into the world of sound.

In this report, we explore a music visualization program developed using the Processing programming language. This program offers a dynamic and interactive visualization of audio spectrum data in real-time, allowing users to observe and interact with the underlying rhythm and structure of the music they are listening to.

Through the combination of audio synthesis and analysis techniques provided by the Minim library, as well as the visual rendering capabilities of Processing, our program transforms audio signals into vibrant visual displays. Users can choose from various visualization modes, including bars, circles, and dynamic geometry, each offering a unique perspective on the music.

Join us on a journey through the realms of sound and vision as we delve into the workings of this music visualization program and explore its potential to enhance the listening experience through immersive visualizations of music.

# Description of the assignment

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

My code corresponds to the rhythm and emotion of the song through dynamic shapes, fast animation effects, and vibrant colors. For instance, I used the map() function to adjust the size of the images based on the song's rhythm, making them change with the music. I also employed color mapping to adjust the colors of the images according to the song's emotion, enhancing the visual experience. Overall, my design aims to align with the atmosphere and emotion of the song, creating a visually dynamic and tension-filled effect.


# How it works

# What I am most proud of in the assignment

What I am most proud of in the assignment is the seamless integration of visual elements with the dynamics and mood of the chosen song. I take pride in how the visuals effectively capture the essence of the music, conveying its energy, tension, and excitement to the audience. Additionally, I am proud of the technical proficiency demonstrated in implementing audio-responsive features, such as adjusting the size and color of shapes based on the song's rhythm and emotion. This not only showcases my creativity but also highlights my ability to translate auditory experiences into captivating visual narratives. 


# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
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

