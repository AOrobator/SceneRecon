//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import org.opencv.core.Mat;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.utils.Converters;

import java.util.ArrayList;
import java.util.List;

// C++: class javaDescriptorExtractor

/**
 * <p>Abstract base class for computing descriptors for image keypoints.</p>
 * <p/>
 * <p>class CV_EXPORTS DescriptorExtractor <code></p>
 * <p/>
 * <p>// C++ code:</p>
 * <p/>
 * <p/>
 * <p>public:</p>
 * <p/>
 * <p>virtual ~DescriptorExtractor();</p>
 * <p/>
 * <p>void compute(const Mat& image, vector<KeyPoint>& keypoints,</p>
 * <p/>
 * <p>Mat& descriptors) const;</p>
 * <p/>
 * <p>void compute(const vector<Mat>& images, vector<vector<KeyPoint> >& keypoints,</p>
 * <p/>
 * <p>vector<Mat>& descriptors) const;</p>
 * <p/>
 * <p>virtual void read(const FileNode&);</p>
 * <p/>
 * <p>virtual void write(FileStorage&) const;</p>
 * <p/>
 * <p>virtual int descriptorSize() const = 0;</p>
 * <p/>
 * <p>virtual int descriptorType() const = 0;</p>
 * <p/>
 * <p>static Ptr<DescriptorExtractor> create(const string& descriptorExtractorType);</p>
 * <p/>
 * <p>protected:...</p>
 * <p/>
 * <p>};</p>
 * <p/>
 * <p>In this interface, a keypoint descriptor can be represented as a </code></p>
 * <p/>
 * <p>dense, fixed-dimension vector of a basic type. Most descriptors follow this
 * pattern as it simplifies computing distances between descriptors. Therefore,
 * a collection of descriptors is represented as "Mat", where each row is a
 * keypoint descriptor.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_descriptor_extractors.html#descriptorextractor">org.opencv.features2d.DescriptorExtractor : public Algorithm</a>
 */
public class DescriptorExtractor {

    public static final int
            SIFT = 1,
            SURF = 2,
            ORB = 3,
            BRIEF = 4,
            BRISK = 5,
            FREAK = 6,
            OPPONENT_SIFT = OPPONENTEXTRACTOR + SIFT,
            OPPONENT_SURF = OPPONENTEXTRACTOR + SURF,
            OPPONENT_ORB = OPPONENTEXTRACTOR + ORB,
            OPPONENT_BRIEF = OPPONENTEXTRACTOR + BRIEF,
            OPPONENT_BRISK = OPPONENTEXTRACTOR + BRISK,
            OPPONENT_FREAK = OPPONENTEXTRACTOR + FREAK;
    private static final int OPPONENTEXTRACTOR = 1000;
    protected final long nativeObj;


    protected DescriptorExtractor(long addr) {
        nativeObj = addr;
    }


    //
    // C++:  void javaDescriptorExtractor::compute(Mat image, vector_KeyPoint& keypoints, Mat descriptors)
    //

    /**
     * <p>Creates a descriptor extractor by name.</p>
     * <p/>
     * <p>The current implementation supports the following types of a descriptor
     * extractor:</p>
     * <ul>
     * <li> <code>"SIFT"</code> -- "SIFT"
     * <li> <code>"SURF"</code> -- "SURF"
     * <li> <code>"BRIEF"</code> -- "BriefDescriptorExtractor"
     * <li> <code>"BRISK"</code> -- "BRISK"
     * <li> <code>"ORB"</code> -- "ORB"
     * <li> <code>"FREAK"</code> -- "FREAK"
     * </ul>
     * <p/>
     * <p>A combined format is also supported: descriptor extractor adapter name
     * (<code>"Opponent"</code> -- "OpponentColorDescriptorExtractor") + descriptor
     * extractor name (see above), for example: <code>"OpponentSIFT"</code>.</p>
     *
     * @param extractorType a extractorType
     * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_descriptor_extractors.html#descriptorextractor-create">org.opencv.features2d.DescriptorExtractor.create</a>
     */
    public static DescriptorExtractor create(int extractorType) {

        DescriptorExtractor retVal = new DescriptorExtractor(create_0(extractorType));

        return retVal;
    }


    //
    // C++:  void javaDescriptorExtractor::compute(vector_Mat images, vector_vector_KeyPoint& keypoints, vector_Mat& descriptors)
    //

    // C++:  void javaDescriptorExtractor::compute(Mat image, vector_KeyPoint& keypoints, Mat descriptors)
    private static native void compute_0(long nativeObj, long image_nativeObj, long keypoints_mat_nativeObj, long descriptors_nativeObj);


    //
    // C++: static javaDescriptorExtractor* javaDescriptorExtractor::create(int extractorType)
    //

    // C++:  void javaDescriptorExtractor::compute(vector_Mat images, vector_vector_KeyPoint& keypoints, vector_Mat& descriptors)
    private static native void compute_1(long nativeObj, long images_mat_nativeObj, long keypoints_mat_nativeObj, long descriptors_mat_nativeObj);


    //
    // C++:  int javaDescriptorExtractor::descriptorSize()
    //

    // C++: static javaDescriptorExtractor* javaDescriptorExtractor::create(int extractorType)
    private static native long create_0(int extractorType);


    //
    // C++:  int javaDescriptorExtractor::descriptorType()
    //

    // C++:  int javaDescriptorExtractor::descriptorSize()
    private static native int descriptorSize_0(long nativeObj);


    //
    // C++:  bool javaDescriptorExtractor::empty()
    //

    // C++:  int javaDescriptorExtractor::descriptorType()
    private static native int descriptorType_0(long nativeObj);


    //
    // C++:  void javaDescriptorExtractor::read(string fileName)
    //

    // C++:  bool javaDescriptorExtractor::empty()
    private static native boolean empty_0(long nativeObj);


    //
    // C++:  void javaDescriptorExtractor::write(string fileName)
    //

    // C++:  void javaDescriptorExtractor::read(string fileName)
    private static native void read_0(long nativeObj, String fileName);

    // C++:  void javaDescriptorExtractor::write(string fileName)
    private static native void write_0(long nativeObj, String fileName);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    /**
     * <p>Computes the descriptors for a set of keypoints detected in an image (first
     * variant) or image set (second variant).</p>
     *
     * @param image       Image.
     * @param keypoints   Input collection of keypoints. Keypoints for which a
     *                    descriptor cannot be computed are removed. Sometimes new keypoints can be
     *                    added, for example: <code>SIFT</code> duplicates keypoint with several
     *                    dominant orientations (for each orientation).
     * @param descriptors Computed descriptors. In the second variant of the method
     *                    <code>descriptors[i]</code> are descriptors computed for a <code>keypoints[i]</code>.
     *                    Row <code>j</code> is the <code>keypoints</code> (or <code>keypoints[i]</code>)
     *                    is the descriptor for keypoint <code>j</code>-th keypoint.
     * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_descriptor_extractors.html#descriptorextractor-compute">org.opencv.features2d.DescriptorExtractor.compute</a>
     */
    public void compute(Mat image, MatOfKeyPoint keypoints, Mat descriptors) {
        Mat keypoints_mat = keypoints;
        compute_0(nativeObj, image.nativeObj, keypoints_mat.nativeObj, descriptors.nativeObj);

        return;
    }

    /**
     * <p>Computes the descriptors for a set of keypoints detected in an image (first
     * variant) or image set (second variant).</p>
     *
     * @param images      Image set.
     * @param keypoints   Input collection of keypoints. Keypoints for which a
     *                    descriptor cannot be computed are removed. Sometimes new keypoints can be
     *                    added, for example: <code>SIFT</code> duplicates keypoint with several
     *                    dominant orientations (for each orientation).
     * @param descriptors Computed descriptors. In the second variant of the method
     *                    <code>descriptors[i]</code> are descriptors computed for a <code>keypoints[i]</code>.
     *                    Row <code>j</code> is the <code>keypoints</code> (or <code>keypoints[i]</code>)
     *                    is the descriptor for keypoint <code>j</code>-th keypoint.
     * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_descriptor_extractors.html#descriptorextractor-compute">org.opencv.features2d.DescriptorExtractor.compute</a>
     */
    public void compute(List<Mat> images, List<MatOfKeyPoint> keypoints, List<Mat> descriptors) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        List<Mat> keypoints_tmplm = new ArrayList<Mat>((keypoints != null) ? keypoints.size() : 0);
        Mat keypoints_mat = Converters.vector_vector_KeyPoint_to_Mat(keypoints, keypoints_tmplm);
        Mat descriptors_mat = new Mat();
        compute_1(nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj, descriptors_mat.nativeObj);
        Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
        Converters.Mat_to_vector_Mat(descriptors_mat, descriptors);
        return;
    }

    public int descriptorSize() {

        int retVal = descriptorSize_0(nativeObj);

        return retVal;
    }

    public int descriptorType() {

        int retVal = descriptorType_0(nativeObj);

        return retVal;
    }

    public boolean empty() {

        boolean retVal = empty_0(nativeObj);

        return retVal;
    }

    public void read(String fileName) {

        read_0(nativeObj, fileName);

        return;
    }

    public void write(String fileName) {

        write_0(nativeObj, fileName);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
