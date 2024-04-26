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

I selected the track "HeroPlant" for its strong rhythmic qualities and engaging beats. This song resonates with me due to its dynamic rhythm, characterized by lively percussion and pulsating melodies. I believe that such energetic music is ideal for generating visually captivating experiences.

# Emotion and Structure of the Song

"HeroPlant" evokes a sense of excitement, vigor, and momentum. The driving rhythm and vibrant instrumentation create an atmosphere charged with adrenaline, reminiscent of embarking on an adventurous journey. Structurally, the song maintains a brisk pace, with alternating musical motifs that contribute to its dynamic nature.

# Visualization Process

I aimed to represent the rhythm and emotion of the song through dynamic elements and rapidly changing colors in the visuals. I used fast animation effects and vibrant colors to express the energy and tension of the song. Through dynamic shapes and flickering effects, I sought to create a tense and exhilarating atmosphere, allowing the audience to feel the intense rhythm and dynamism of the song.

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

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](https://github.com/tuyi3008/MusicVisuals/assets/73605412/d2ffb65f-179c-4c6e-9f1a-f3da163496ca)
](https://youtu.be/wQS0hrj-QjA)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

