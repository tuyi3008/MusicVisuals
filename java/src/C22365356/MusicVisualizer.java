package C22365356;

import ddf.minim.*;
import ddf.minim.analysis.FFT;
import processing.core.*;

public class MusicVisualizer extends PApplet {

    Minim minim;
    AudioPlayer player;
    FFT fft;

    int numBars = 60;
    float[] barHeights;
    float[] barSpeeds;
    int[] barColors;
    float[] barWidths; // New array to store the width of bars

    float[] angles;
    float[] distances;
    float[] speeds;
    int numCircles = 100;
    int maxDistance;

    int numTriangle = 50;
    int[] TriangleColors;

    boolean showBars = false;
    boolean showCircles = true;
    boolean showGeometry = false;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        minim = new Minim(this);
        player = minim.loadFile("heroplanet.mp3", 1024);
        player.play();

        fft = new FFT(player.bufferSize(), player.sampleRate());

        barHeights = new float[numBars];
        barSpeeds = new float[numBars];
        barColors = new int[numBars];
        barWidths = new float[numBars]; // Initialize barWidths array
        for (int i = 0; i < numBars; i++) {
            barHeights[i] = height / 2;
            barSpeeds[i] = random(5, 20); // Adjusted speed range
            barColors[i] = color(random(255), random(255), random(255)); // Random color for each bar
            barWidths[i] = 10; // Initial width of bars
        }

        angles = new float[numCircles];
        distances = new float[numCircles];
        speeds = new float[numCircles];
        maxDistance = width / 4;
        for (int i = 0; i < numCircles; i++) {
            angles[i] = random(TWO_PI);
            distances[i] = random(maxDistance);
            speeds[i] = random(0.01f, 0.05f);
        }
    }

    public void draw() {
        // Dynamic gradient background based on music
        float brightness = map(sin(frameCount * 0.05f), -1, 1, 50, 100);
        background(0, brightness); // Adjust background brightness based on music

        fft.forward(player.mix);

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

        if (showBars) {
            // Draw bars
            drawBars();
        }

        if (showGeometry) {
            // Show dynamic geometry with triangles based on music
            showGeometry();
        }
    }

    // Show dynamic geometry with triangles
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

        // Update rotation angle
        rotation += rotationSpeed;

        // Ensure rotation stays within bounds
        if (rotation > maxRotation) {
            rotation = 0; // Reset rotation angle
        }
    }

    // Draw bars moving horizontally
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

    public void keyPressed() {
        if (key == '1') {
            showCircles = true;
            showBars = false;
            showGeometry = false;
        } else if (key == '2') {
            showCircles = false;
            showBars = true;
            showGeometry = false;
        } else if (key == '3') {
            showCircles = false;
            showBars = false;
            showGeometry = true;
        }
    }

    public static void main(String[] args) {
        PApplet.main("C22365356.MusicVisualizer");
    }
}
